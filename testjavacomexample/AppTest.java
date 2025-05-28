const assert = require('assert');
const { welcomeMessage } = require('./src/main/resources/static/js/app');

describe('welcomeMessage', function () {
    it('should return a proper greeting', function () {
        assert.strictEqual(welcomeMessage('Alice'), 'Welcome to the website, Alice!');
    });
});

