(ns foreclojure-solutions.p102
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "intoCamelCase"
  (__ "something") => "something"
  (__ "multi-word-key") => "multiWordKey"
  (__ "leaveMeAlone") => "leaveMeAlone")
