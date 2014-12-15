/// comments describing what this is about

guard {
  build ("canary")
  build ("all-unit")
  parallel (
    {build ("bok-choy")},
    {build ("acceptance")},
    {build ("quality")}
  )
} rescue {
  build ("always-report")
}
