package com.example.assignmentweek4.ui.views.soal2

class Category(imageUrl:String,name:String,itemNumber: Number){
    var ImageUrl = imageUrl+"/ffffff?text=${name}"
    var name = name
    var itemNumber = itemNumber
}

fun getAllCategories(): List<Category> {
    return listOf(
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Cars", itemNumber = 100),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Gadgets", itemNumber = 50),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Electronics", itemNumber = 75),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Clothing", itemNumber = 200),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Furniture", itemNumber = 210),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Books", itemNumber = 300),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Sports", itemNumber = 80),
        Category(imageUrl = "https://image.dummyjson.com/210/ea9999", name = "Beauty", itemNumber = 150),
    )
}

class Product(imageUrl: String,name: String,price: Int,location: String,sold: Int){
    var imageUrl = imageUrl+"/ffffff?text=${name}"
    var name = name
    var price = price
    var location = location
    var sold = sold
}

fun getAllProducts(): List<Product> {
    return listOf(
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Samsung S23",
            price = 699000,
            location = "New York",
            sold = 50
        ),

        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Laptop ABC",
            price = 129009,
            location = "Los Angeles",
            sold = 30
        ),
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Smartwatch QRS",
            price = 19009,
            location = "San Francisco",
            sold = 20
        ),
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Canon EOS 718D",
            price = 5990000,
            location = "Chicago",
            sold = 10
        ),
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Samsung S23",
            price = 699000,
            location = "New York",
            sold = 50
        ),

        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Laptop ABC",
            price = 129009,
            location = "Los Angeles",
            sold = 30
        ),
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Smartwatch QRS",
            price = 19009,
            location = "San Francisco",
            sold = 20
        ),
        Product(
            imageUrl = "https://image.dummyjson.com/200/2986cc",
            name = "Canon EOS 718D",
            price = 5990000,
            location = "Chicago",
            sold = 10
        )

    )
}