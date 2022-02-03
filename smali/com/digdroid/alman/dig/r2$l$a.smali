.class Lcom/digdroid/alman/dig/r2$l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/q3$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$l;->b(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r2$l;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$l;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$l$a;->a:Lcom/digdroid/alman/dig/r2$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/s3;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$l$a;->a:Lcom/digdroid/alman/dig/r2$l;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$l;->b:Lcom/digdroid/alman/dig/r2;

    invoke-static {v0, p1}, Lcom/digdroid/alman/dig/r2;->p3(Lcom/digdroid/alman/dig/r2;Ljava/util/ArrayList;)V

    return-void
.end method
