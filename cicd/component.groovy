
def unitTests(ctx) {
    echo "PLUGIN ::: unitTests "
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

