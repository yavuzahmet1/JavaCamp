console.log("Merhaba Kodlama.io")
let students = { id: 1, name: "Ahmet" }
console.log(students)

function save() {
    console.log("saved !")
}

save();

function saved(student) {
    console.log(student.name + " : saved !")
}

saved(students)

function saving(student, point = 10) {
    console.log(student.name + " : saved ! : " + point)
}

saving(students, undefined)

let students1 = ["Ahmet", "Mehmet", "Ali"]

console.log(students1)

let students2 = [students1, "Hasan", "Vali"]

console.log(students2)

//rest
let showProducts = function (id, ...products) {
    console.log(id)
    console.log(products[0])

}

console.log(typeof showProducts)

console.log(showProducts)

showProducts(11, "Elma", "Kiraz", "Karpuz")

//Spread

let points=[33,2,5,88,12,90,22]

console.log(Math.max(1,3,2,6,4,66))
console.log(...points)//çıktısı -> 33 2 5 88 12 90 22
console.log(Math.max(...points))
console.log("ABCD","D",..."EFGZ",": H")

//destructuring
let [a,b,c,d]=[1,5,99,3]

console.log(c)

let populations=[1,5,99,3]

let[f,g,h,j]=populations

console.log(h)

let[m,n,k,[t,z]]=populations

console.log(n)




