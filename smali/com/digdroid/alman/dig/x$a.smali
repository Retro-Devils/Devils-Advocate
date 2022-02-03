.class Lcom/digdroid/alman/dig/x$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/x;->m(Landroid/content/Context;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/digdroid/alman/dig/x$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/x;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x$a;->a:Lcom/digdroid/alman/dig/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/digdroid/alman/dig/x$e;Lcom/digdroid/alman/dig/x$e;)I
    .locals 0

    iget-object p2, p2, Lcom/digdroid/alman/dig/x$e;->a:Ljava/lang/String;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    iget-object p1, p1, Lcom/digdroid/alman/dig/x$e;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int/2addr p2, p1

    return p2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/digdroid/alman/dig/x$e;

    check-cast p2, Lcom/digdroid/alman/dig/x$e;

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/x$a;->a(Lcom/digdroid/alman/dig/x$e;Lcom/digdroid/alman/dig/x$e;)I

    move-result p1

    return p1
.end method
