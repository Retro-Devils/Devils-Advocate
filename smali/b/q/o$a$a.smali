.class Lb/q/o$a$a;
.super Lb/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/q/o$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb/d/a;

.field final synthetic b:Lb/q/o$a;


# direct methods
.method constructor <init>(Lb/q/o$a;Lb/d/a;)V
    .locals 0

    iput-object p1, p0, Lb/q/o$a$a;->b:Lb/q/o$a;

    iput-object p2, p0, Lb/q/o$a$a;->a:Lb/d/a;

    invoke-direct {p0}, Lb/q/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb/q/m;)V
    .locals 2

    iget-object v0, p0, Lb/q/o$a$a;->a:Lb/d/a;

    iget-object v1, p0, Lb/q/o$a$a;->b:Lb/q/o$a;

    iget-object v1, v1, Lb/q/o$a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Lb/d/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lb/q/m;->P(Lb/q/m$f;)Lb/q/m;

    return-void
.end method
