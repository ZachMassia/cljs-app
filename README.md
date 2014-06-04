# cljs-app

A Leiningen template for getting a ClojureScript development environment setup with [Weasel](http://github.com/tomjakubowski/weasel) and [Simpleton](http://github.com/tailrecursion/lein-simpleton).

## Usage

Run `lein new cljs-app my-app && cd $_` and then `lein cljsbuild auto`.

Open up `src/core.cljs` in Emacs and run `cider-jack-in` or hit <kbd>C-c M-j</kbd>.

Once the REPL is fired up, enter `(browser-repl)`.

You now have two options:
* Open `file://path/to/my-app/resources/index.html`.
* Run `lein server` and open [localhost:8080](http://localhost:8080).

To make sure everything is working, try out `(js/alert "Testing")` in the REPL.

## License

Copyright © 2014 Zachary Massia

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
