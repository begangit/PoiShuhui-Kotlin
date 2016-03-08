package com.flying.xiaopo.poishuhui_kotlin.domain.model

/**
 * Created by Flying SnowBean on 16-3-2.
 */
data class Cover(val coverUrl: String, val title: String, val link: String)

data class News(val title: String, val createdTime: String, val link: String)

data class NewsContainer(val title: String, val newsList: List<News>)

data class BookInfo(val updateTime: String, val description: String)

data class Page(val title: String, val link: String)

data class BookDetail(val pages: List<Page>, val info: BookInfo)
