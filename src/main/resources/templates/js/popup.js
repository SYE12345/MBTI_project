// const open = () => {
//     document.querySelector(".modal").classList.remove("hidden");
// }
// const close = () => {
//     document.querySelector(".modal").classList.add("hidden");
// }
//
//     document.querySelector(".openBtn").addEventListener("click", open);
//     document.querySelector(".closeBtn").addEventListener("click", close);
//     document.querySelector(".bg").addEventListener("click", close);


// 모든 openBtn 버튼 요소를 선택합니다.
const openButtons = document.querySelectorAll(".openBtn");

const open = () => {
    document.querySelector(".modal").classList.remove("hidden");
};

const close = () => {
    document.querySelector(".modal").classList.add("hidden");
};

// 각 openBtn 버튼에 대해 이벤트 리스너를 등록합니다.
openButtons.forEach((button) => {
    button.addEventListener("click", open);
});

document.querySelector(".closeBtn").addEventListener("click", close);
document.querySelector(".bg").addEventListener("click", close);
