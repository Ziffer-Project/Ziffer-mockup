class UrlMappings {

	static mappings = {
        "/dashboard/categories.json" {
            controller = "Category"
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
