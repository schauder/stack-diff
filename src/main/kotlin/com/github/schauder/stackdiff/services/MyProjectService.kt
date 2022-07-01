package com.github.schauder.stackdiff.services

import com.intellij.openapi.project.Project
import com.github.schauder.stackdiff.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
