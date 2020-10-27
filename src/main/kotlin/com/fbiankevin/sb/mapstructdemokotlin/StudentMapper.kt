package com.fbiankevin.sb.mapstructdemokotlin

import org.mapstruct.Mapper

@Mapper(componentModel = "spring")
interface StudentMapper {
    fun toResource(student:Student): StudentResource
}