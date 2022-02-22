import gsap from 'gsap';

function init() {
    gsap.from(".header", {ease:"linear", autoAlpha:0});
    gsap.from(".main-header", {ease:"linear",duration:3,autoAlpha:0});
    gsap.from(".main-status", {ease:"linear", autoAlpha:0});
    gsap.from(".main-btn", {ease:"linear", autoAlpha:0});
    // gsap.from("li", {ease:"linear", autoAlpha:0})
    // gsap.from("h1", {y:80, duration:1})
    // gsap.from("h2", {y:-80, duration:1}, "<")
    // gsap.from("p", {y:30}, "-=0.2")
    // gsap.from("button", {y:50}, "-=0.4") 
    // gsap.from("#items > g", {scale:0, transformOrigin:"50% 50%", stagger:0.1}, "-=0.5")
}
window.addEventListener("load", function(event) { 
    init(); //do stuff
});