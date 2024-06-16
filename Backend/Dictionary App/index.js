const url= "https://api.dictionaryapi.dev/api/v2/entries/en/";
const result = document.getElementById("result");
const sound = document.getElementById("sound");
const btn = document.getElementById("search-btn");

btn.addEventListener("click", () =>{
    let inpWord = document.getElementById("inp-word").value;

    if (!inpWord) {
        result.innerHTML = `<h3>Please enter a word.</h3>`;
        return;
    }
    
    fetch(`${url}${inpWord}`)
        .then((response) => response.json())
        .then((data) => {
            console.log(data);

            const word = data[0].word;
            const partOfSpeech = data[0]?.meanings[0]?.partOfSpeech || "Part of speech not available";
            const definition = data[0]?.meanings[0]?.definitions[0]?.definition || "Definition not available";
            const example = data[0]?.meanings[0]?.definitions[0]?.example || "Example not available";
            const soundUrl = data[0]?.phonetics[0]?.audio;

            console.log("Sound URL:", soundUrl);
            result.innerHTML = `<div class="word">
                        <h3>${word}</h3>
                        <button>
                            <i class="fas fa-volume-up"></i>

                        </button>
                    </div>
                    <div class="details">
                        <p>${partOfSpeech}</p>
                        <p>/sample/</p>
                     </div>
                     <p class="word-meaning">
                        ${definition}
                     </p>
                     <p class="word-example">
                        ${example}
                     </p>
            </div>
            `;

            if (soundUrl) {
                sound.src = soundUrl;
            }else {
                sound.src="";
            }
        });

        function playSound(url) {
            if (url){
                sound.src = url;
                sound.play().catch(error => {
                    console.error("Error playing sound:", error);
                });
            }else{
                alert("No Pronunciation Available");
            }
            }
        }
)
