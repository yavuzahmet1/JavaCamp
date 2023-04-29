class Customer {
    constructor(id, customerNumber) {
        this.id = id;
        this.customerNumber = customerNumber
    }
}

let customer = new Customer(1, "3345");
customer.name = "Ahmet"
customer.bisey = "Birşey"

console.log(customer)

console.log(customer.name)

//console.log(Customer)

//console.log(customer.customerNumber)
let cart = [
    {id:1, productName:"Telefon", quantity:3, unitPrice:4000},
    {id:2, productName:"Bardak", quantity:2, unitPrice:30},
    {id:3, productName:"Kalem", quantity:1, unitPrice:20},
    {id:4, productName:"Şarj Cihazı", quantity:2, unitPrice:100},
    {id:5, productName:"Kitap", quantity:3, unitPrice:30},
    {id:6, productName:"Pot", quantity:5, unitPrice:150},
]

console.log("<ul>")
cart.map(product=>{
    console.log("<li>"+product.productName + " : " 
    + product.unitPrice * product.quantity+"</li>")
})
console.log("</ul>")

let filteredProducts=cart.filter(product=>product.unitPrice<100)

console.log(filteredProducts)