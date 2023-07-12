 data class Users(var name:String ,
                  var email:String? ,
                  var gender:String ,
                  var age:Int ,
                  var company:String,
                  var address:String ,
                  var role:String ,
                  var salary:Int ) {
 }





 fun getUsers() : List<Users>{
     var get_users : List<Users> = listOf<Users>(
         Users("John","john@gmail.com","male",24,"google","Chennai, Tamilnadu","Developer",40000),
         Users("Doe","doe@yahoo.com","male",35,"yahoo","Denmark, Canada","Tester",30000),
         Users("Ajith","","male",22,"zoho","Chengalpattu, Tamilnadu","QA",25000),
         Users("Praveena","praveena@gmail.com","female",22,"HTC","Banglore, Karnataka","Developer",50000),
         Users("Jagdesh","jagdesh@gmail.com","male",22,"HCL","Hosur, Karnataka","Developer",35000),
         Users("Naveen kumar","naveen@gmail.com","male",30,"TCS","Taramani, Tamilnadu","Tester",38000))

     return get_users

 }

 fun groupByBasedOnRole(key:String) : Map<String,List<Users>>{
   var getusers = getUsers()
     var groupeddata = mutableMapOf<String,MutableList<Users>>()
     getusers.forEach{ user ->
         var groupedkey = user.role
       if(groupeddata.containsKey(groupedkey)) {
           groupeddata[groupedkey]?.add(user)
       }else {
           groupeddata[groupedkey] = mutableListOf(user)
       }
     }
return groupeddata
 }

 fun groupByBasedOnGender(key:String) : Map<String,List<Users>>{
     var getusers = getUsers()
     var groupeddatabygender = mutableMapOf<String,MutableList<Users>>()
     getusers.forEach{ user ->
         var groupedkey = user.gender
         if(groupeddatabygender.containsKey(groupedkey)) {
             groupeddatabygender[groupedkey]?.add(user)
         }else {
             groupeddatabygender[groupedkey] = mutableListOf(user)
         }
     }
     return groupeddatabygender
 }

 fun UserListBasedOnHishestSalary(): List<Users> {
     var getusers = getUsers()
    var sorter_users = getusers.sortedBy { it.salary}
     return sorter_users

 }

 fun UserListBasedOnLowestSalary(): List<Users> {
     var getusers = getUsers()
     var sorter_users = getusers.sortedByDescending { it.salary }
     return sorter_users
 }

 fun UserListWithSalary() {
     var getusers = getUsers()
     for (i in getusers){
         println("${i.name} -- ${i.salary}")
     }
 }

 fun sumOfMaleUsersSalary(): Int {
     var getusers = getUsers();
     var maleusers = getusers.filter { it.gender == "male" }
     var maleusersSalary = maleusers.sumOf { it.salary }
    return maleusersSalary
 }

 fun getUserWithEmail(email: String): List<Users> {

     var getusers = getUsers();
     var getemail = getusers.filter { it.email == email }
     return getemail
 }

     fun getUsersWithLocation(address: String) {
         var getusers = getUsers()
         var getaddress = getusers.filter { it.address.contains(address) }
         for (i in getaddress) {
             println(i.name)
         }
     }



 fun main(args: Array<String>) {
     println(groupByBasedOnRole("role"))
     println("------------------------------------")
     println(groupByBasedOnGender("gender"))
     println("------------------------------------")
     println(UserListBasedOnHishestSalary())
     println("------------------------------------")
     println(UserListBasedOnLowestSalary())
     println("------------------------------------")
     getUsersWithLocation("Taramani")
     println("------------------------------------")
     UserListWithSalary()
     println("------------------------------------")
     println("Sum of the Male users:${sumOfMaleUsersSalary()}")
     println("------------------------------------")
     println("User belongs to the given email id :  ${getUserWithEmail("doe@yahoo.com")}")
 }