package com.shinyj.template.mvi.domain.state

interface StateEvent {
    fun errorInfo(): String
    fun eventName(): String
    fun shouldDisplayProgressBar(): Boolean
}