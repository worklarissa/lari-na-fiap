let speech = new SpeechSynthesisUtterance();

let voices = [];

let voiceSelect = document.querySelector("select");

window.speechSynthesis.onvoiceschanged = () =>{
    voices = window.speechSynthesis.getVoices();
    speech.voices = voices [0];

    voices.forEach((voice,i) => (voiceSelect.options[i] = new Option(voice.name)));
}
document.querySelector("button").addEventListener("click", () => {
    speech.text = document.querySelector(textarea).valuewindow.speechSynthesis.speak(speech)
})