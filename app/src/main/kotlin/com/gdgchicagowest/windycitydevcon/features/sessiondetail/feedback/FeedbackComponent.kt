package com.gdgchicagowest.windycitydevcon.features.sessiondetail.feedback

import dagger.Subcomponent

@Subcomponent(modules = arrayOf(FeedbackModule::class))
interface FeedbackComponent {
    fun inject(feedbackDialog: FeedbackDialog)
}