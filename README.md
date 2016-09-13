# Windy City DevCon

This is the app for Windy City DevCon 2016.  It is based entirely on the [Firebase](https://firebase.google.com) data in `data.json`.

The app should be easily customizable to other deveveloper conferences by simply:

1. Setting up your own Firebase instance, and replacing the `google-services.json` file with your own.
1. Updating the `data.json` file with your conference details, keeping the same structure, and uploading it to Firebase.
1. Updates graphical assets and strings.

# Architecture

The app uses an MVP architecture in which the interfaces, presenters and models are contained in a Java only `core` module, and the Android components, like Firebase integration (`providers`), custom View implementations, etc. are in the Android `app` module.

You will also find no Java in the project, as it is entirely written in [Kotlin](https://kotlinlang.org/).

# License

Copyright 2016 Ryan Harter.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.