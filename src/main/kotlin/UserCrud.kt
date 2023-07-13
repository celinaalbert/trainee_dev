val User_list:MutableList<User> = mutableListOf()
var id : Long = 0
data class User(
   var id : Long,
    var FirstName : String,
    var LastName : String,
    var age : Int,
    var Gender : String? = null,
    var address : List<Address>
){

}
data class Address(
    val id : Long,
    val streetname : String,
    val city : String,
    val state : String
) {

}
data class UserResquest(
    var FirstName: String,
    var LastName : String,
    var age : Int,
    var Gender : String,
    var address : List<AddressRequest>
){

}

data class AddressRequest(
    val streetname : String,
    val city : String,
    val state : String
) {

}


fun AddressRequest.toModel() = Address(id = id , streetname = streetname ,city = city , state = state)


fun UserResquest.toModel() = User(id = ++id, FirstName = FirstName , LastName =  LastName , age = age, Gender = Gender , address = address.map { it.toModel() })

fun createUser(user : UserResquest) : User {
   val userModel= user.toModel()
    User_list.add(userModel)
    return userModel
}

fun getAllUser() {
     User_list.forEach{ println(it) }
}

fun updateUserById(user_ : UserResquest , uniId : Long): MutableList<User> {
    val user_model = user_.toModel()
    User_list.forEach{ it ->
        if(it.id == uniId) {
            it.FirstName = user_model.FirstName
            it.LastName = user_model.LastName
            it.age =  user_model.age
            it.Gender = user_model.Gender
        }
    }
    return User_list

}


fun getUserWithFirstname(value: String): List<User> {
    val getUserList = User_list
    val getuserdetails = getUserList.filter { it.FirstName.contains(value) }
    return getuserdetails
}


fun deleteUserWithId(uni_id : Long) {
      User_list.forEach{
          if (it.id == uni_id){
              User_list.remove(it)
          }
      }


}

fun main(args:Array<String>){
    val user_1 = UserResquest("celina" ,  "helan" ,22 , "female", listOf(AddressRequest("op-lane","chennai" ,"Tamilnadu")) )
    val user_2 = UserResquest("Naseern" ,"Banu" ,22 , "female" , listOf(AddressRequest("annanagar" ,"chennai" ,"Tamilnadu")))

    createUser(user_1)
    createUser(user_2)
    println("User created Successfully!!")
    println("---------------Get the User List-------------------------")
    getAllUser()
    println("-------------Get the User with the First name --------------------------------")
    println(getUserWithFirstname("celina"))
    println("----------------Update the User--------------------------")
    val update_User = UserResquest("Lokesh" ,"Pinjala" ,24 , "male" , listOf(AddressRequest("annanagar" ,"gumbidipundi" ,"Tamilnadu")))
    println(updateUserById(update_User,2))
    deleteUserWithId(1)
    println("--------- After deleting  a list with Id----------------------------")
    getAllUser()

}