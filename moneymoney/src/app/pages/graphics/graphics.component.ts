import { Component, OnInit } from '@angular/core';
import type { ChartData, ChartOptions } from 'chart.js';
import {TransactionService} from '../../services/transaction.service';
import {UserService} from '../../services/user.service';

@Component({
  selector: 'mm-graphics',
  templateUrl: './graphics.component.html',
  styleUrls: ['./graphics.component.scss']
})
export class GraphicsComponent implements OnInit {
  data: ChartData = {
    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
    datasets: [
      {
        label: 'My First Dataset',
        data: [65, 59, 80, 81, 56, 55, 40],
        fill: false,
        backgroundColor: [
          'rgba(255, 99, 132, 0.2)',
          'rgba(255, 159, 64, 0.2)',
          'rgba(255, 205, 86, 0.2)',
          'rgba(75, 192, 192, 0.2)',
          'rgba(54, 162, 235, 0.2)',
          'rgba(153, 102, 255, 0.2)',
          'rgba(201, 203, 207, 0.2)',
        ],
        borderColor: [
          'rgb(255, 99, 132)',
          'rgb(255, 159, 64)',
          'rgb(255, 205, 86)',
          'rgb(75, 192, 192)',
          'rgb(54, 162, 235)',
          'rgb(153, 102, 255)',
          'rgb(201, 203, 207)',
        ],
        borderWidth: 1,
      },
    ],
  };
  options: ChartOptions = {
    responsive: true,
    plugins: {
      legend: {
        position: 'top',
      },
      title: {
        display: true,
        text: 'Chart.js Doughnut Chart',
      },
    },
  };

  constructor(
    private transactionService: TransactionService,
    private userService: UserService) { }

  ngOnInit(): void {
    this.transactionService.getTransactionsByGroup(this.userService.user.id)
      .subscribe( groups => {
        const values = new Array<number>();

        for (const group of groups.values()) {
          values.push(group.reduce((acc, value) => acc + value.value, 0));
        }
      });
  }

}
