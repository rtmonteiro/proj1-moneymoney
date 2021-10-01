const proxy = [
  {
    context: '/api',
    target: 'http://localhost:8080',
    secure: true,
    pathRewrite: {'^/api' : ''}
  }
];
module.exports = proxy;
