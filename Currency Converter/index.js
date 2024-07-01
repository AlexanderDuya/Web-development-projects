document.addEventListener('DOMContentLoaded', function () {
    const apiBase = 'https://v6.exchangerate-api.com/v6/8885c8e46e556c8c639971d9';
    const apiLatest = `${apiBase}/latest/USD`;

    const fromDropDown = document.getElementById("from-currency-select");
    const toDropDown = document.getElementById("to-currency-select");
    const amountInput = document.getElementById("amount");
    const convertButton = document.getElementById("convert-button");
    const resultDisplay = document.getElementById("result");

    // Fetch the latest exchange rates and populate the dropdowns
    fetch(apiLatest)
        .then(response => response.json())
        .then(data => {
            const currencies = Object.keys(data.conversion_rates);

            currencies.forEach((currency) => {
                const optionFrom = document.createElement("option");
                optionFrom.value = currency;
                optionFrom.text = currency;
                fromDropDown.appendChild(optionFrom);

                const optionTo = document.createElement("option");
                optionTo.value = currency;
                optionTo.text = currency;
                toDropDown.appendChild(optionTo);
            });
        })
        .catch(error => {
            console.error('Error fetching currency data:', error);
        });

    // Handle conversion
    convertButton.addEventListener('click', function () {
        const fromCurrency = fromDropDown.value;
        const toCurrency = toDropDown.value;
        const amount = parseFloat(amountInput.value);

        if (amount > 0) {
            fetch(`${apiBase}/latest/${fromCurrency}`)
                .then(response => response.json())
                .then(data => {
                    const exchangeRate = data.conversion_rates[toCurrency];
                    const convertedAmount = (amount * exchangeRate).toFixed(2);
                    resultDisplay.textContent = `${amount} ${fromCurrency} = ${convertedAmount} ${toCurrency}`;
                })
                .catch(error => {
                    console.error('Error fetching exchange rates:', error);
                    resultDisplay.textContent = 'Error fetching exchange rates';
                });
        } else {
            resultDisplay.textContent = 'Please enter a valid amount';
        }
    });
});
