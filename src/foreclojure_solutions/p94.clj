(ns foreclojure-solutions.p94
  (:use midje.sweet))

(defn __ []
  "Implement me!")

(future-fact "Game of Life"
  (__ ["      "  
          " ##   "
          " ##   "
          "   ## "
          "   ## "
          "      "]) => ["      "  
      " ##   "
      " #    "
      "    # "
      "   ## "
      "      "]
  (__ ["     "
          "     "
          " ### "
          "     "
          "     "]) => ["     "
      "  #  "
      "  #  "
      "  #  "
      "     "]
  (__ ["      "
          "      "
          "  ### "
          " ###  "
          "      "
          "      "]) => ["      "
      "   #  "
      " #  # "
      " #  # "
      "  #   "
      "      "])
