(ns foreclojure-solutions.p111
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Crossword puzzle"
  true => (__ "the" ["_ # _ _ e"])
  false => (__ "the" ["c _ _ _"
                      "d _ # e"
                      "r y _ _"])
  true => (__ "joy" ["c _ _ _"
                      "d _ # e"
                      "r y _ _"])
  false => (__ "joy" ["c o n j"
                      "_ _ y _"
                      "r _ _ #"])
  (= true  (__ "clojure" ["_ _ _ # j o y"
                          "_ _ o _ _ _ _"
                          "_ _ f _ # _ _"]))
   => true)
