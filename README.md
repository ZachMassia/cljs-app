# cljs-app

A Leiningen template for getting a ClojureScript development environment setup with [Weasel](github.com/tomjakubowski/weasel) and [Simpleton](github.com/tailrecursion/lein-simpleton).

## Usage

Run `lein cljsbuild auto` in a terminal.

Open up `src/core.cljs` in Emacs and run `cider-jack-in` or hit <kbd>C-c M-j</kbd>.

Once the REPL is fired up, enter `(browser-repl)`.

You now have two options:
* Open `file://path/to/project/resources/index.html`.
* Run `lein server` and open `localhost:8080`.

## License

Copyright © 2014 Zachary Massia

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
