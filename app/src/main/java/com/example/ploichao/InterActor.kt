package com.example.ploichao

import com.example.ploichao.callapi.Request


class InterActor {

    interface ActData {
        fun callLisCategorytApi(callback: Request.ResponseListCategory)
    }
}