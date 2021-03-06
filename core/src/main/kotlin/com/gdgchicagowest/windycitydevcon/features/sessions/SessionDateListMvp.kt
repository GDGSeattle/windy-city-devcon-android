package com.gdgchicagowest.windycitydevcon.features.sessions

import com.gdgchicagowest.windycitydevcon.features.shared.Mvp

interface SessionDateListMvp {

    interface View : Mvp.View {
        fun showNoSessionDates()
        fun showSessionDates(sessionDates: List<String>)
    }

    interface Presenter : Mvp.Presenter<View> {
    }

}