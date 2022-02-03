.class Lcom/digdroid/alman/dig/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/c;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/c;->p0:Lcom/digdroid/alman/dig/c$d;

    invoke-virtual {p1, p3}, Lcom/digdroid/alman/dig/c$d;->a(I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/c;->p0:Lcom/digdroid/alman/dig/c$d;

    const/4 p2, 0x1

    :goto_0
    invoke-virtual {p1, p3, p2}, Lcom/digdroid/alman/dig/c$d;->c(IZ)V

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "https://digdroid.com/forums/discussion/"

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    iget-object p4, p4, Lcom/digdroid/alman/dig/c;->o0:Lorg/json/JSONArray;

    invoke-virtual {p4, p3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object p4

    const-string p5, "DiscussionID"

    invoke-virtual {p4, p5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide p4

    invoke-virtual {p2, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/p1$a;->z(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/c$a;->b:Lcom/digdroid/alman/dig/c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/c;->p0:Lcom/digdroid/alman/dig/c$d;

    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    return-void
.end method
