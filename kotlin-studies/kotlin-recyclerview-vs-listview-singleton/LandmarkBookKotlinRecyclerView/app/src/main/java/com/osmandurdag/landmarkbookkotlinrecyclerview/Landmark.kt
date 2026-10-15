package com.osmandurdag.landmarkbookkotlinrecyclerview

import java.io.Serializable

// Serializable arayuzu bu sinifi serilestirilebilir hale getiriyor
// Boylece intentlerde bu sinifin nesnelerini putExtra araciligiyla verebiliyoruz
class Landmark(val name : String, val country : String, val image : Int) : Serializable {
}