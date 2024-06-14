document.addEventListener('DOMContentLoaded', () => {
    const jokeButton = document.getElementById('jokeButton');
    const jokeDiv = document.getElementById('joke');

    jokeButton.addEventListener('click', () => {
        // Fetch a random joke from the API
        fetch('https://official-joke-api.appspot.com/random_joke')
            .then(response => {
                if (!response.ok) {
                    throw new Error('Network response was not ok');
                }
                return response.json();
            })
            .then(data => {
                // Display the joke in the jokeDiv
                jokeDiv.textContent = `${data.setup} - ${data.punchline}`;
            })
            .catch(error => {
                // Handle any errors
                jokeDiv.textContent = "Oops! Couldn't fetch a joke. Try again later.";
                console.error('Error fetching joke:', error);
            });
    });
});
