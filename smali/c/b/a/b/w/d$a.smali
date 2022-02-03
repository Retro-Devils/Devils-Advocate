.class Lc/b/a/b/w/d$a;
.super Landroidx/core/content/c/f$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/w/d;->h(Landroid/content/Context;Lc/b/a/b/w/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/b/a/b/w/f;

.field final synthetic b:Lc/b/a/b/w/d;


# direct methods
.method constructor <init>(Lc/b/a/b/w/d;Lc/b/a/b/w/f;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/w/d$a;->b:Lc/b/a/b/w/d;

    iput-object p2, p0, Lc/b/a/b/w/d$a;->a:Lc/b/a/b/w/f;

    invoke-direct {p0}, Landroidx/core/content/c/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/w/d$a;->b:Lc/b/a/b/w/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lc/b/a/b/w/d;->c(Lc/b/a/b/w/d;Z)Z

    iget-object v0, p0, Lc/b/a/b/w/d$a;->a:Lc/b/a/b/w/f;

    invoke-virtual {v0, p1}, Lc/b/a/b/w/f;->a(I)V

    return-void
.end method

.method public d(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/w/d$a;->b:Lc/b/a/b/w/d;

    iget v1, v0, Lc/b/a/b/w/d;->e:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lc/b/a/b/w/d;->b(Lc/b/a/b/w/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lc/b/a/b/w/d$a;->b:Lc/b/a/b/w/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc/b/a/b/w/d;->c(Lc/b/a/b/w/d;Z)Z

    iget-object p1, p0, Lc/b/a/b/w/d$a;->a:Lc/b/a/b/w/f;

    iget-object v0, p0, Lc/b/a/b/w/d$a;->b:Lc/b/a/b/w/d;

    invoke-static {v0}, Lc/b/a/b/w/d;->a(Lc/b/a/b/w/d;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lc/b/a/b/w/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
