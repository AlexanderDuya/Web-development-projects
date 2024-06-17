let api =  `https://v6.exchangerate-api.com/v6/8885c8e46e556c8c639971d9/latest/USD`;

const fromDropDown = document.getElementById("from-currency-select");
const toDropDown = document.getElementById("to-currency-select");

currencies.forEach((currency) => {
    const optionFrom = document.createElement("option");
    optionFrom.value = currency.code;
    optionFrom.text = currency.name;
    fromDropDown.appendChild(optionFrom);

    const optionTo = document.createElement("option");
    optionTo.value = currency.code;
    optionTo.text = currency.name;
    toDropDown.appendChild(optionTo);
});