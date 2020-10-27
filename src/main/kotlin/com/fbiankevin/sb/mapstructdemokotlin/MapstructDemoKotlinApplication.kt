package com.fbiankevin.sb.mapstructdemokotlin

import com.github.pozo.KotlinBuilder
import org.springframework.boot.Banner
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MapstructDemoKotlinApplication(
        val studentMapper: StudentMapper
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        val student = Student(

                name = "Kevin Fabian"
        )

        println(studentMapper.toResource(student))

    }
}

fun main(args: Array<String>) {
    runApplication<MapstructDemoKotlinApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}

@KotlinBuilder
data class Student(
        val id: Long? = null,
        val name: String? = null
)

@KotlinBuilder
data class StudentResource(
        val id: Long? = null,
        val name: String? = null
)