# io.swagger.client - Kotlin client library for 

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://gateway.marvel.com/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DocspublicApi* | [**getCharacterEventsCollection**](docs/DocspublicApi.md#getcharactereventscollection) | **GET** /v1/public/characters/{characterId}/events | Fetches lists of events filtered by a character id.
*DocspublicApi* | [**getCharacterIndividual**](docs/DocspublicApi.md#getcharacterindividual) | **GET** /v1/public/characters/{characterId} | Fetches a single character by id.
*DocspublicApi* | [**getCharacterSeriesCollection**](docs/DocspublicApi.md#getcharacterseriescollection) | **GET** /v1/public/characters/{characterId}/series | Fetches lists of series filtered by a character id.
*DocspublicApi* | [**getCharacterStoryCollection**](docs/DocspublicApi.md#getcharacterstorycollection) | **GET** /v1/public/characters/{characterId}/stories | Fetches lists of stories filtered by a character id.
*DocspublicApi* | [**getComicCharacterCollection**](docs/DocspublicApi.md#getcomiccharactercollection) | **GET** /v1/public/comics/{comicId}/characters | Fetches lists of characters filtered by a comic id.
*DocspublicApi* | [**getComicIndividual**](docs/DocspublicApi.md#getcomicindividual) | **GET** /v1/public/comics/{comicId} | Fetches a single comic by id.
*DocspublicApi* | [**getComicStoryCollection**](docs/DocspublicApi.md#getcomicstorycollection) | **GET** /v1/public/comics/{comicId}/stories | Fetches lists of stories filtered by a comic id.
*DocspublicApi* | [**getComicsCharacterCollection**](docs/DocspublicApi.md#getcomicscharactercollection) | **GET** /v1/public/characters/{characterId}/comics | Fetches lists of comics filtered by a character id.
*DocspublicApi* | [**getComicsCollection**](docs/DocspublicApi.md#getcomicscollection) | **GET** /v1/public/creators/{creatorId}/comics | Fetches lists of comics filtered by a creator id.
*DocspublicApi* | [**getComicsCollection_0**](docs/DocspublicApi.md#getcomicscollection_0) | **GET** /v1/public/events/{eventId}/comics | Fetches lists of comics filtered by an event id.
*DocspublicApi* | [**getComicsCollection_1**](docs/DocspublicApi.md#getcomicscollection_1) | **GET** /v1/public/series/{seriesId}/comics | Fetches lists of comics filtered by a series id.
*DocspublicApi* | [**getComicsCollection_2**](docs/DocspublicApi.md#getcomicscollection_2) | **GET** /v1/public/comics | Fetches lists of comics.
*DocspublicApi* | [**getComicsCollection_3**](docs/DocspublicApi.md#getcomicscollection_3) | **GET** /v1/public/stories/{storyId}/comics | Fetches lists of comics filtered by a story id.
*DocspublicApi* | [**getCreatorCollection**](docs/DocspublicApi.md#getcreatorcollection) | **GET** /v1/public/creators | Fetches lists of creators.
*DocspublicApi* | [**getCreatorCollection_0**](docs/DocspublicApi.md#getcreatorcollection_0) | **GET** /v1/public/stories/{storyId}/characters | Fetches lists of characters filtered by a story id.
*DocspublicApi* | [**getCreatorCollection_1**](docs/DocspublicApi.md#getcreatorcollection_1) | **GET** /v1/public/series/{seriesId}/creators | Fetches lists of creators filtered by a series id.
*DocspublicApi* | [**getCreatorCollection_2**](docs/DocspublicApi.md#getcreatorcollection_2) | **GET** /v1/public/comics/{comicId}/creators | Fetches lists of creators filtered by a comic id.
*DocspublicApi* | [**getCreatorCollection_3**](docs/DocspublicApi.md#getcreatorcollection_3) | **GET** /v1/public/characters | Fetches lists of characters.
*DocspublicApi* | [**getCreatorCollection_4**](docs/DocspublicApi.md#getcreatorcollection_4) | **GET** /v1/public/stories/{storyId}/creators | Fetches lists of creators filtered by a story id.
*DocspublicApi* | [**getCreatorCollection_5**](docs/DocspublicApi.md#getcreatorcollection_5) | **GET** /v1/public/events/{eventId}/creators | Fetches lists of creators filtered by an event id.
*DocspublicApi* | [**getCreatorEventsCollection**](docs/DocspublicApi.md#getcreatoreventscollection) | **GET** /v1/public/creators/{creatorId}/events | Fetches lists of events filtered by a creator id.
*DocspublicApi* | [**getCreatorIndividual**](docs/DocspublicApi.md#getcreatorindividual) | **GET** /v1/public/creators/{creatorId} | Fetches a single creator by id.
*DocspublicApi* | [**getCreatorSeriesCollection**](docs/DocspublicApi.md#getcreatorseriescollection) | **GET** /v1/public/creators/{creatorId}/series | Fetches lists of series filtered by a creator id.
*DocspublicApi* | [**getCreatorStoryCollection**](docs/DocspublicApi.md#getcreatorstorycollection) | **GET** /v1/public/creators/{creatorId}/stories | Fetches lists of stories filtered by a creator id.
*DocspublicApi* | [**getEventCharacterCollection**](docs/DocspublicApi.md#geteventcharactercollection) | **GET** /v1/public/events/{eventId}/characters | Fetches lists of characters filtered by an event id.
*DocspublicApi* | [**getEventIndividual**](docs/DocspublicApi.md#geteventindividual) | **GET** /v1/public/events/{eventId} | Fetches a single event by id.
*DocspublicApi* | [**getEventSeriesCollection**](docs/DocspublicApi.md#geteventseriescollection) | **GET** /v1/public/events/{eventId}/series | Fetches lists of series filtered by an event id.
*DocspublicApi* | [**getEventStoryCollection**](docs/DocspublicApi.md#geteventstorycollection) | **GET** /v1/public/events/{eventId}/stories | Fetches lists of stories filtered by an event id.
*DocspublicApi* | [**getEventsCollection**](docs/DocspublicApi.md#geteventscollection) | **GET** /v1/public/stories/{storyId}/events | Fetches lists of events filtered by a story id.
*DocspublicApi* | [**getEventsCollection_0**](docs/DocspublicApi.md#geteventscollection_0) | **GET** /v1/public/series/{seriesId}/events | Fetches lists of events filtered by a series id.
*DocspublicApi* | [**getEventsCollection_1**](docs/DocspublicApi.md#geteventscollection_1) | **GET** /v1/public/events | Fetches lists of events.
*DocspublicApi* | [**getIssueEventsCollection**](docs/DocspublicApi.md#getissueeventscollection) | **GET** /v1/public/comics/{comicId}/events | Fetches lists of events filtered by a comic id.
*DocspublicApi* | [**getSeriesCharacterWrapper**](docs/DocspublicApi.md#getseriescharacterwrapper) | **GET** /v1/public/series/{seriesId}/characters | Fetches lists of characters filtered by a series id.
*DocspublicApi* | [**getSeriesCollection**](docs/DocspublicApi.md#getseriescollection) | **GET** /v1/public/series | Fetches lists of series.
*DocspublicApi* | [**getSeriesIndividual**](docs/DocspublicApi.md#getseriesindividual) | **GET** /v1/public/series/{seriesId} | Fetches a single comic series by id.
*DocspublicApi* | [**getSeriesStoryCollection**](docs/DocspublicApi.md#getseriesstorycollection) | **GET** /v1/public/series/{seriesId}/stories | Fetches lists of stories filtered by a series id.
*DocspublicApi* | [**getStoryCollection**](docs/DocspublicApi.md#getstorycollection) | **GET** /v1/public/stories | Fetches lists of stories.
*DocspublicApi* | [**getStoryIndividual**](docs/DocspublicApi.md#getstoryindividual) | **GET** /v1/public/stories/{storyId} | Fetches a single comic story by id.
*DocspublicApi* | [**getStorySeriesCollection**](docs/DocspublicApi.md#getstoryseriescollection) | **GET** /v1/public/stories/{storyId}/series | Fetches lists of series filtered by a story id.

<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.botob.marvelapi.client.models.Character](docs/Character.md)
 - [com.botob.marvelapi.client.models.CharacterDataContainer](docs/CharacterDataContainer.md)
 - [com.botob.marvelapi.client.models.CharacterDataWrapper](docs/CharacterDataWrapper.md)
 - [com.botob.marvelapi.client.models.CharacterList](docs/CharacterList.md)
 - [com.botob.marvelapi.client.models.CharacterSummary](docs/CharacterSummary.md)
 - [com.botob.marvelapi.client.models.Comic](docs/Comic.md)
 - [com.botob.marvelapi.client.models.ComicDataContainer](docs/ComicDataContainer.md)
 - [com.botob.marvelapi.client.models.ComicDataWrapper](docs/ComicDataWrapper.md)
 - [com.botob.marvelapi.client.models.ComicDate](docs/ComicDate.md)
 - [com.botob.marvelapi.client.models.ComicList](docs/ComicList.md)
 - [com.botob.marvelapi.client.models.ComicPrice](docs/ComicPrice.md)
 - [com.botob.marvelapi.client.models.ComicSummary](docs/ComicSummary.md)
 - [com.botob.marvelapi.client.models.Creator](docs/Creator.md)
 - [com.botob.marvelapi.client.models.CreatorDataContainer](docs/CreatorDataContainer.md)
 - [com.botob.marvelapi.client.models.CreatorDataWrapper](docs/CreatorDataWrapper.md)
 - [com.botob.marvelapi.client.models.CreatorList](docs/CreatorList.md)
 - [com.botob.marvelapi.client.models.CreatorSummary](docs/CreatorSummary.md)
 - [com.botob.marvelapi.client.models.Event](docs/Event.md)
 - [com.botob.marvelapi.client.models.EventDataContainer](docs/EventDataContainer.md)
 - [com.botob.marvelapi.client.models.EventDataWrapper](docs/EventDataWrapper.md)
 - [com.botob.marvelapi.client.models.EventList](docs/EventList.md)
 - [com.botob.marvelapi.client.models.EventSummary](docs/EventSummary.md)
 - [com.botob.marvelapi.client.models.Image](docs/Image.md)
 - [com.botob.marvelapi.client.models.Series](docs/Series.md)
 - [com.botob.marvelapi.client.models.SeriesDataContainer](docs/SeriesDataContainer.md)
 - [com.botob.marvelapi.client.models.SeriesDataWrapper](docs/SeriesDataWrapper.md)
 - [com.botob.marvelapi.client.models.SeriesList](docs/SeriesList.md)
 - [com.botob.marvelapi.client.models.SeriesSummary](docs/SeriesSummary.md)
 - [com.botob.marvelapi.client.models.Story](docs/Story.md)
 - [com.botob.marvelapi.client.models.StoryDataContainer](docs/StoryDataContainer.md)
 - [com.botob.marvelapi.client.models.StoryDataWrapper](docs/StoryDataWrapper.md)
 - [com.botob.marvelapi.client.models.StoryList](docs/StoryList.md)
 - [com.botob.marvelapi.client.models.StorySummary](docs/StorySummary.md)
 - [com.botob.marvelapi.client.models.TextObject](docs/TextObject.md)
 - [com.botob.marvelapi.client.models.Url](docs/Url.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
