.class Lcom/digdroid/alman/dig/g3$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g3$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$f;->a:Lcom/digdroid/alman/dig/g3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$f;->a:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/g3$k;

    iput-object p2, p1, Lcom/digdroid/alman/dig/g3$k;->k:Ljava/lang/String;

    return-void
.end method
