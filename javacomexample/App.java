function welcomeMessage(name) {
    return `Welcome to the website, ${name}!`;
}

// Export for testing
if (typeof module !== 'undefined') {
    module.exports = { welcomeMessage };
}

