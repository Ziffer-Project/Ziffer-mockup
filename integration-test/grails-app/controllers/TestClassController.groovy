import grails.converters.JSON
import grails.rest.RestfulController

class TestClassController extends RestfulController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    static responseFormats = ['json']

    def index() {
        def json = Category.list() as JSON
        render json
    }

    def show(TestClass testClassInstance) {
        respond testClassInstance
    }

}
