import {IGroup} from './group';

export interface ITransaction{
    id: number;
    transaction_date: Date;
    value: number;
    currency: string;
    group?: IGroup;
}
