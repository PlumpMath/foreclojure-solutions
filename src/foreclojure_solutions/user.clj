;; ~/.lein/user.clj
(do (use 'clojure.repl)
  (use 'clojure.pprint)
  (use 'cd-client.core)
  (set-local-mode! "/User/zand/dev/docs/clojuredocs-snapshot-latest.txt" )
  (cdoc filter))
