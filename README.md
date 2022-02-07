# _Marvel Comics_

##### _This app fetches a Marvel comic from a given ID and displays the essential data - February 2022_

#### By _**Boris Guenebaut**_

## Description

_This app dives into the Marvel API and uses a simple fragment UI to demonstrate the fetching of a given comic data.
It includes a separate module **marvel-api** that has been generated with **swagger-codegen* from the [Marvel Swagger Specification](https://gateway.marvel.com/docs/public) and slightly adjusted after._

## Setup

1. Set your developer keys as environment variables, e.g. for Unix:
```
export MARVEL_API_PUBLIC_KEY="{MY_MARVEL_PUBLIC_KEY}"
export MARVEL_API_PRIVATE_KEY="{MY_MARVEL_PRIVATE_KEY}"
```
2. Use Android Studio or Gradle script to build the app
3. Run the unit tests in module **marvel-api**
4. Run the UI tests in module **app**

## Technologies/Libraries Used

* **swagger-codegen**
```
swagger-codegen generate \
  -i https://gateway.marvel.com/docs/public \
  -l kotlin-client \
  -o marvel-api/src/main/java/com/botob/marvelapi/client
```
* **com.squareup.moshi**
* **com.squareup.okhttp3**
* **com.github.bumptech.glide**
* Some Jetpack capabilities like Material Design, View Binding, MVVM

### Legal

Copyright (c) 2022 **_Boris Guenebaut_**

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.