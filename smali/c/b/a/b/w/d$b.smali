.class Lc/b/a/b/w/d$b;
.super Lc/b/a/b/w/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/w/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Lc/b/a/b/w/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/text/TextPaint;

.field final synthetic b:Lc/b/a/b/w/f;

.field final synthetic c:Lc/b/a/b/w/d;


# direct methods
.method constructor <init>(Lc/b/a/b/w/d;Landroid/text/TextPaint;Lc/b/a/b/w/f;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/w/d$b;->c:Lc/b/a/b/w/d;

    iput-object p2, p0, Lc/b/a/b/w/d$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Lc/b/a/b/w/d$b;->b:Lc/b/a/b/w/f;

    invoke-direct {p0}, Lc/b/a/b/w/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lc/b/a/b/w/d$b;->b:Lc/b/a/b/w/f;

    invoke-virtual {v0, p1}, Lc/b/a/b/w/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/w/d$b;->c:Lc/b/a/b/w/d;

    iget-object v1, p0, Lc/b/a/b/w/d$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Lc/b/a/b/w/d;->k(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lc/b/a/b/w/d$b;->b:Lc/b/a/b/w/f;

    invoke-virtual {v0, p1, p2}, Lc/b/a/b/w/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
