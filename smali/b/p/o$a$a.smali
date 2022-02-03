.class Lb/p/o$a$a;
.super Lb/p/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/p/o$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/d/a;

.field final synthetic b:Lb/p/o$a;


# direct methods
.method constructor <init>(Lb/p/o$a;Lb/d/a;)V
    .locals 0

    iput-object p1, p0, Lb/p/o$a$a;->b:Lb/p/o$a;

    iput-object p2, p0, Lb/p/o$a$a;->a:Lb/d/a;

    invoke-direct {p0}, Lb/p/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb/p/m;)V
    .locals 2

    iget-object v0, p0, Lb/p/o$a$a;->a:Lb/d/a;

    iget-object v1, p0, Lb/p/o$a$a;->b:Lb/p/o$a;

    iget-object v1, v1, Lb/p/o$a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lb/d/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lb/p/m;->P(Lb/p/m$f;)Lb/p/m;

    return-void
.end method
