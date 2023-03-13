package com.example.myfirsapplication

data class Friend(
    val id: Int,
    val firstname:String,
    val lastname:String,
    val address: String,
    val zipcode:String
    //val image: Image
)

class FriendList(){
    private val friendList= listOf(
        Friend(
        1, "Mortada","Ismail Almosawi","TestStreet","0012"
    ),
        Friend(
            2,"Rida","Ismail Almosawi","TestStreet","0312"
    )

    )

}