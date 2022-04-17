package com.github.f71uday.offsensivedemo.services

import com.intellij.openapi.project.Project
import com.github.f71uday.offsensivedemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
