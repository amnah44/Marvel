package com.amnah.marvelapp.data.repository.domain.mapper

interface IMapper<CHARACTER_RESULT, EVENT_RESULT, COMICS_RESULT, SERIES_RESULT, CHARACTERS> {
    fun characterMap(input: CHARACTER_RESULT): CHARACTERS
    fun eventsMap(input: EVENT_RESULT): CHARACTERS
    fun comicsMap(input: COMICS_RESULT): CHARACTERS
    fun seriesMap(input: SERIES_RESULT): CHARACTERS
}