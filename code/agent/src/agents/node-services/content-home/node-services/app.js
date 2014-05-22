var config = require("./config");
var express = require('express');
var path = require('path');
var logger = require('morgan');
var bodyParser = require('body-parser');

var events = require('./routes/events');
var metadata = require('./routes/metadata');

var app = express();
app.disable('x-powered-by');

app.use(bodyParser.json());
app.use(logger('dev'));

app.use('/', metadata(config));
app.use('/events', events(config));

/// catch 404 and forward to error handler
app.use(function(req, res, next) {
    var err = new Error('Not Found');
    err.status = 404;
    next(err);
});

app.use(function(err, req, res, next) {
    res.send(err.status || 500);
});

module.exports = app;
