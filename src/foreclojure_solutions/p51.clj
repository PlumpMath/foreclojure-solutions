(ns foreclojure-solutions.p51
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Advanced Destructuring"
  [1 2 [3 4 5] [1 2 3 4 5]] => (let [[a b & c :as d] __] [a b c d]))
