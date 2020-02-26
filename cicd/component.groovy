
echo "PLUGIN ::: unitTests "

return "Return section"

/*
def unitTests(ctx) {
    echo "PLUGIN ::: unitTests "
   */
/* withDockerContainer(image:'maven:3.6.3-jdk-8-slim'){
        sh 'mvn test'
    }*//*

}

def build(ctx) {
    echo "PLUGIN ::: build "
}

def componentTests(ctx) {
    echo "PLUGIN ::: componentTests "
}

return [
    name: 'plugin',
    type: 'library',
    language: 'groovy',
    pkg: [
        type: 'repo/tag'
    ],
    build: this.&build,
    test: [
        unit: this.&unitTests
    ]
]
*/
