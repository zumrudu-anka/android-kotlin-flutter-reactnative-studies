package com.osmandurdag.functionsandclasses

class Simpson {
    // region Property
        var age = 0 // public is default
        var name = ""
        private var job = ""
    // endregion Property

    constructor(){

    }

    constructor(age: Int, name: String, job: String){
        this.age = age
        this.name = name
        this.job = job
    }

    fun setJob(job: String){
        this.job = job
    }

    fun getJob() : String{
        return this.job
    }
}