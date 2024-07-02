rootProject.name = "nexus-parent"

sequenceOf(
    "common"
).forEach {
    include("nexus-$it")
    project(":nexus-$it").projectDir = file(it)
}