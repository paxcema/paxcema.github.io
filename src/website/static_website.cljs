;;; Following: https://betweentwoparens.com/deoploy-clojurescript-to-github-pages#fn-project-name

;; To build dev bundle (from deps.edn folder):
;; clj -m cljs.main -d "pcerdam.github.io/out" -c website.static-website -r

;; To build production bundle
;; clj -m cljs.main -O advanced -c "website.static-website"

;; Project structure
;; deps.edn; index.html; style.css; README.md
;; - src/*.cljs (this file)
;; - pcerdam.github.io/out/*.files

(ns website.static-website)

(js/console.log "Hey there!")